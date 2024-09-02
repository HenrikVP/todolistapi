package dk.tec.todolistapi;


import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;

public class Location implements Serializable {
    @NonNull
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;

    public Location(@Nullable String provider) {
        throw new RuntimeException("Stub!");
    }

    public Location(@NonNull Location location) {
        throw new RuntimeException("Stub!");
    }

    public void set(@NonNull Location location) {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
        throw new RuntimeException("Stub!");
    }

    public float distanceTo(@NonNull Location dest) {
        throw new RuntimeException("Stub!");
    }

    public float bearingTo(@NonNull Location dest) {
        throw new RuntimeException("Stub!");
    }

    @Nullable
    public String getProvider() {
        throw new RuntimeException("Stub!");
    }

    public void setProvider(@Nullable String provider) {
        throw new RuntimeException("Stub!");
    }

    public long getTime() {
        throw new RuntimeException("Stub!");
    }

    public void setTime(long timeMs) {
        throw new RuntimeException("Stub!");
    }

    public long getElapsedRealtimeNanos() {
        throw new RuntimeException("Stub!");
    }

    public long getElapsedRealtimeMillis() {
        throw new RuntimeException("Stub!");
    }

    public long getElapsedRealtimeAgeMillis() {
        throw new RuntimeException("Stub!");
    }

    public long getElapsedRealtimeAgeMillis(long referenceRealtimeMs) {
        throw new RuntimeException("Stub!");
    }

    public void setElapsedRealtimeNanos(long elapsedRealtimeNs) {
        throw new RuntimeException("Stub!");
    }

    public double getElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }

    public void setElapsedRealtimeUncertaintyNanos(double elapsedRealtimeUncertaintyNs) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }

    public void removeElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }

    public double getLatitude() {
        throw new RuntimeException("Stub!");
    }

    public void setLatitude(double latitudeDegrees) {
        throw new RuntimeException("Stub!");
    }

    public double getLongitude() {
        throw new RuntimeException("Stub!");
    }

    public void setLongitude(double longitudeDegrees) {
        throw new RuntimeException("Stub!");
    }

    public float getAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void setAccuracy(float horizontalAccuracyMeters) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void removeAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public double getAltitude() {
        throw new RuntimeException("Stub!");
    }

    public void setAltitude(double altitudeMeters) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasAltitude() {
        throw new RuntimeException("Stub!");
    }

    public void removeAltitude() {
        throw new RuntimeException("Stub!");
    }

    public float getVerticalAccuracyMeters() {
        throw new RuntimeException("Stub!");
    }

    public void setVerticalAccuracyMeters(float altitudeAccuracyMeters) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasVerticalAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void removeVerticalAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public float getSpeed() {
        throw new RuntimeException("Stub!");
    }

    public void setSpeed(float speedMetersPerSecond) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasSpeed() {
        throw new RuntimeException("Stub!");
    }

    public void removeSpeed() {
        throw new RuntimeException("Stub!");
    }

    public float getSpeedAccuracyMetersPerSecond() {
        throw new RuntimeException("Stub!");
    }

    public void setSpeedAccuracyMetersPerSecond(float speedAccuracyMeterPerSecond) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasSpeedAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void removeSpeedAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public float getBearing() {
        throw new RuntimeException("Stub!");
    }

    public void setBearing(float bearingDegrees) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasBearing() {
        throw new RuntimeException("Stub!");
    }

    public void removeBearing() {
        throw new RuntimeException("Stub!");
    }

    public float getBearingAccuracyDegrees() {
        throw new RuntimeException("Stub!");
    }

    public void setBearingAccuracyDegrees(float bearingAccuracyDegrees) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasBearingAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void removeBearingAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public double getMslAltitudeMeters() {
        throw new RuntimeException("Stub!");
    }

    public void setMslAltitudeMeters(double mslAltitudeMeters) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasMslAltitude() {
        throw new RuntimeException("Stub!");
    }

    public void removeMslAltitude() {
        throw new RuntimeException("Stub!");
    }

    public float getMslAltitudeAccuracyMeters() {
        throw new RuntimeException("Stub!");
    }

    public void setMslAltitudeAccuracyMeters(float mslAltitudeAccuracyMeters) {
        throw new RuntimeException("Stub!");
    }

    public boolean hasMslAltitudeAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void removeMslAltitudeAccuracy() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public boolean isFromMockProvider() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMock() {
        throw new RuntimeException("Stub!");
    }

    public void setMock(boolean mock) {
        throw new RuntimeException("Stub!");
    }

    @Nullable
    public boolean isComplete() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(@Nullable Object o) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @NonNull
    public String toString() {
        throw new RuntimeException("Stub!");
    }


    public int describeContents() {
        throw new RuntimeException("Stub!");
    }



    @NonNull
    public static String convert(double coordinate, int outputType) {
        throw new RuntimeException("Stub!");
    }

    public static double convert(@NonNull String coordinate) {
        throw new RuntimeException("Stub!");
    }

    public static void distanceBetween(double startLatitude, double startLongitude, double endLatitude, double endLongitude, float[] results) {
        throw new RuntimeException("Stub!");
    }
}
