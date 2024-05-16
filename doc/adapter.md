# Adapter Design Pattern

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.


My sincere apologies for the oversight! Thank you for catching that mistake. Let's correct it. Here's the updated description:

## Universal Plug Problem

**Problem Scenario**:
Suppose we're building a travel adapter application that integrates with American and European plugs. Each plug type provides its own interface for connecting to sockets. Our goal is to create an adapter that allows both plug types to work seamlessly with a common interface.

**Solution using the Adapter Pattern**:
1. **Define the Problem**:
    - We have two incompatible interfaces: `AmericanPlug` and `EuropeanPlug`.
    - Our application expects a common interface (`UniversalPlug`) to connect devices.

2. **Create the Objects**:
    - Define the existing classes: `AmericanPlug` and `EuropeanPlug`.
    - Define the target interface: `UniversalPlug`.

3. **Implement the Adapter**:
    - Create adapter classes (`AmericanPlugAdapter` and `EuropeanPlugAdapter`) that adapt the existing plugs to the `UniversalPlug` interface.
    - The adapters translate method calls from the common interface to the specific plug methods.

4. **Usage**:
    - In our application, use the `UniversalPlug` interface to connect devices.
    - The adapters ensure that both American and European plugs can be used interchangeably.

---

Thank you for your patience, and I appreciate your attention to detail! 🔌🌍

My apologies for the oversight! You're absolutely right. Let's correct that. We'll create separate adapters for American and European plugs. Here's the updated example:

```java
// Target interface for universal plugs
interface UniversalPlug {
    void connect();
}

// Existing American plug
class AmericanPlug {
    void plugInAmericanSocket() {
        System.out.println("Connected to American socket");
    }
}

// Existing European plug
class EuropeanPlug {
    void plugInEuropeanSocket() {
        System.out.println("Connected to European socket");
    }
}

// Adapter for American plug
class AmericanPlugAdapter implements UniversalPlug {
    private final AmericanPlug americanPlug;

    AmericanPlugAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void connect() {
        americanPlug.plugInAmericanSocket();
    }
}

// Adapter for European plug
class EuropeanPlugAdapter implements UniversalPlug {
    private final EuropeanPlug europeanPlug;

    EuropeanPlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void connect() {
        europeanPlug.plugInEuropeanSocket();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPlug();
        UniversalPlug adapterA = new AmericanPlugAdapter(americanPlug);
        adapterA.connect();

        EuropeanPlug europeanPlug = new EuropeanPlug();
        UniversalPlug adapterE = new EuropeanPlugAdapter(europeanPlug);
        adapterE.connect();
    }
}
```

Now each adapter correctly corresponds to its respective plug type. Thank you for catching that, and I appreciate your attention to detail! 🔌🌍

## Audio Player Problem 

Certainly! Let's create a Java solution using the **Adapter Design Pattern** to integrate the MP3, WAV, and AIFF audio libraries into a unified interface for playing audio tracks.

1. **Define the Problem**:
    - We have three incompatible interfaces: `MP3Player`, `WAVPlayer`, and `AIFFPlayer`.
    - Our music player application expects a common interface (`AudioPlayer`) to play audio tracks.

2. **Create the Objects**:
    - Define the existing classes: `MP3Player`, `WAVPlayer`, and `AIFFPlayer`.
    - Define the target interface: `AudioPlayer`.

3. **Implement the Adapter**:
    - Create adapter classes (`MP3Adapter`, `WAVAdapter`, and `AIFFAdapter`) that adapt the existing players to the `AudioPlayer` interface.
    - The adapters translate method calls from the common interface to the specific library methods.

4. **Usage**:
    - In our music player app, use the `AudioPlayer` interface to play audio tracks.
    - The adapters ensure that tracks from all three libraries can be played seamlessly.

Here's a simplified Java code example:

```java
// Target interface for audio players
interface AudioPlayer {
    void play(String track);
}

// Existing MP3 player
class MP3Player {
    void playMP3(String track) {
        System.out.println("Playing MP3 track: " + track);
    }
}

// Adapter for MP3
class MP3Adapter implements AudioPlayer {
    private final MP3Player mp3Player;

    MP3Adapter(MP3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void play(String track) {
        mp3Player.playMP3(track);
    }
}

// Existing WAV player
class WAVPlayer {
    void playWAV(String track) {
        System.out.println("Playing WAV track: " + track);
    }
}

// Adapter for WAV
class WAVAdapter implements AudioPlayer {
    private final WAVPlayer wavPlayer;

    WAVAdapter(WAVPlayer wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    @Override
    public void play(String track) {
        wavPlayer.playWAV(track);
    }
}

// Existing AIFF player
class AIFFPlayer {
    void playAIFF(String track) {
        System.out.println("Playing AIFF track: " + track);
    }
}

// Adapter for AIFF
class AIFFAdapter implements AudioPlayer {
    private final AIFFPlayer aiffPlayer;

    AIFFAdapter(AIFFPlayer aiffPlayer) {
        this.aiffPlayer = aiffPlayer;
    }

    @Override
    public void play(String track) {
        aiffPlayer.playAIFF(track);
    }
}

// Usage
public class MusicPlayerApp {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        AudioPlayer mp3Adapter = new MP3Adapter(mp3Player);
        mp3Adapter.play("Song.mp3");

        WAVPlayer wavPlayer = new WAVPlayer();
        AudioPlayer wavAdapter = new WAVAdapter(wavPlayer);
        wavAdapter.play("Song.wav");

        AIFFPlayer aiffPlayer = new AIFFPlayer();
        AudioPlayer aiffAdapter = new AIFFAdapter(aiffPlayer);
        aiffAdapter.play("Song.aiff");
    }
}
```

In this example, the adapters (`MP3Adapter`, `WAVAdapter`, and `AIFFAdapter`) allow the existing audio players to collaborate seamlessly with the common `AudioPlayer` interface. Now our music player app can handle tracks from all three libraries without any issues! 🎵🔊

Feel free to explore more real-world scenarios where the Adapter pattern simplifies interactions between incompatible interfaces! 😊

For further details, you can refer to resources like [GeeksforGeeks Adapter Pattern](https://www.geeksforgeeks.org/adapter-pattern/) and [Baeldung's Adapter Pattern Tutorial](https://www.baeldung.com/java-adapter-pattern).¹²

Source: Conversation with Bing, 16/05/2024
- (1) Adapter Design Pattern - GeeksforGeeks. https://www.geeksforgeeks.org/adapter-pattern/.
- (2) The Adapter Pattern in Java | Baeldung. https://www.baeldung.com/java-adapter-pattern.
- (3) Bridging the Gap: Exploring the Adapter Design Pattern in Java. https://medium.com/@rajeshvelmani/bridging-the-gap-exploring-the-adapter-design-pattern-in-java-823218841a9c.