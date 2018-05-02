package org.jivesoftware.smackx.ping;

/**
 * Defines the callback used whenever the ping IQ is coming.
 */
public interface PingListener {

    /**
     * Called when the ping is accepted successfully.
     */
    void ping(String stanzaId);

}
