/*
 *
 *  Copyright (C) 2021 Piotr Przybył
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package dev.softwaregarden.spring.batch.first_steps.writers.util;

import java.util.List;

import org.springframework.batch.item.support.ListItemReader;

public class JpaCharacterDummyReader extends ListItemReader<JpaCharacter> {

    public JpaCharacterDummyReader() {
        super(List.of(
            new JpaCharacter(1L, "John", "Doe", "john.doe@example.com"),
            new JpaCharacter(2L, "John", "McClay", "j_mcclay@example.com"),
            new JpaCharacter(3L, "Ellen", "Ripley", "alien@area51.example.com"),
            new JpaCharacter(4L, "Vito", "Corleone", "Don_Corleone@example.com"),
            new JpaCharacter(5L, "Mia", "Wallace", "mwallace@example.com")
        ));
    }
}
