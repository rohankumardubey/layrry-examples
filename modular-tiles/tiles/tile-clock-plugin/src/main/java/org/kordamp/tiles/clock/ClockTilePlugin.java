/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2021 Andres Almiray.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kordamp.tiles.clock;

import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.TileBuilder;
import org.kordamp.tiles.model.AbstractTilePlugin;
import org.kordamp.tiles.model.TileContext;

import java.util.Locale;
import java.util.Random;

public class ClockTilePlugin extends AbstractTilePlugin {
    @Override
    protected Tile createTile(TileContext context) {
        return TileBuilder.create()
            .skinType(Tile.SkinType.CLOCK)
            .prefSize(context.getTileWidth(), context.getTileHeight())
            .title("Clock Tile")
            .text("Whatever text")
            .dateVisible(true)
            .locale(Locale.US)
            .running(true)
            .build();
    }
}
