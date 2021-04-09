package xyz.gianlu.librespot.metadata;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Gianlu
 */
public final class UnsupportedId implements PlayableId {
    private final String uri;

    UnsupportedId(@NotNull String uri) {
        this.uri = uri;
    }

    @Override
    @Contract("-> fail")
    public @NotNull byte[] getGid() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Contract("-> fail")
    public @NotNull String hexId() {
        throw new UnsupportedOperationException();
    }

    @Override
    public @NotNull String toSpotifyUri() {
        return uri;
    }

    @NotNull
    @Override
    public String toString() {
        return "UnsupportedId{" + toSpotifyUri() + '}';
    }
}
