package com.pez.audio_player_application.interfaces;

import com.pez.audio_player_application.pojo.Album;

import java.util.List;

/**
 * @Auteur Baudouin
 * @Date 15/02/2017.
 */

public interface AlbumInfoChangeListener {

    void onAlbumInfoRetrieved(List<Album> albums);

}
