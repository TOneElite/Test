package org.teamone.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class RoomMapper implements RowMapper<Room> {

    @Override
    public Room mapRow(ResultSet rs, int i) throws SQLException {
	Room room = new Room();
        room.setRoomCode(rs.getString("room_code"));
        room.setTableCount(rs.getInt("table_count"));
        room.setPictureLink(rs.getString("picture_link"));
        room.setDescription(rs.getString("description"));
	return room;
    }
    
}