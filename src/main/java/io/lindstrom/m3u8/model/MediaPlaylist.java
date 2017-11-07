package io.lindstrom.m3u8.model;

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
public interface MediaPlaylist extends Playlist {
    int targetDuration();

    @Value.Default
    default int mediaSequence() {
        return 0;
    }

    @Value.Default
    default boolean ongoing() {
        return true;
    }

    Optional<PlaylistType> playlistType();

    @Value.Default
    default boolean iFramesOnly() {
        return false;
    }

    List<MediaSegment> mediaSegments();

    static Builder builder() {
        return new Builder();
    }

    class Builder extends MediaPlaylistBuilder {
    }
}
