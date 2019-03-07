package SplitTemporaryVariable;

public class SplitTemporaryVariable {

    double _primaryForce;
    double _mass;
    int _delay;
    double _secondaryForce;

    public SplitTemporaryVariable(double _primaryForce, double _mass, int _delay, double _secondaryForce) {
        this._primaryForce = _primaryForce;
        this._mass = _mass;
        this._delay = _delay;
        this._secondaryForce = _secondaryForce;
    }

    double getDistanceTravelled(int time) {

        return secondaryTime(time) > 0 ?
                getDistanceWithSecondaryTimeGreaterThanZero(time) :
                getDistance(primaryAcceleration(), primaryTime(time));
    }

    private double getDistanceWithSecondaryTimeGreaterThanZero(int time) {
        return getDistance(primaryAcceleration(), primaryTime(time))
                + primaryVelocity() * secondaryTime(time)
                + getDistance(secondaryAcceleration(), secondaryTime(time));
    }

    private double secondaryAcceleration() {
        return (_primaryForce + _secondaryForce) / _mass;
    }

    private double primaryVelocity() {
        return primaryAcceleration() * _delay;
    }

    private int secondaryTime(int time) {
        return time - _delay;
    }

    private int primaryTime(int time) {
        return Math.min(time, _delay);
    }

    private double primaryAcceleration() {
        return _primaryForce / _mass;
    }

    private double getDistance(double acceleration, int time) {
        return 0.5 * acceleration * time * time;
    }
}
