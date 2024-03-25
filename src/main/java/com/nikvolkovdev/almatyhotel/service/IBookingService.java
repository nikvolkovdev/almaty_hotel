package com.nikvolkovdev.almatyhotel.service;

import com.nikvolkovdev.almatyhotel.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
