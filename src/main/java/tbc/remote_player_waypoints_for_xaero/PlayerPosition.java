/*      Remote player waypoints for Xaero's Map
        Copyright (C) 2024  Leander Knüttel

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see <https://www.gnu.org/licenses/>.*/

package tbc.remote_player_waypoints_for_xaero;

/**
 * A player's auth profile and position
 */
public class PlayerPosition {
    public final String player;
    public final int x;
    public final int y;
    public final int z;

    public PlayerPosition(String username, int x, int y, int z) {
        this.player = username;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean CompareCords(PlayerPosition otherPosition){
        return (x == otherPosition.x) && (y == otherPosition.y) && (z == otherPosition.z);
    }
}