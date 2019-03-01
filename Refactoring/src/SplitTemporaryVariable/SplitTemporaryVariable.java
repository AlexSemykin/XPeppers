package SplitTemporaryVariable;

public class SplitTemporaryVariable {

    double _primaryForce;
    double _mass;
    int _delay;
    double _secondaryForce;

    double getDistanceTravelled(int time) {

        double acc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        final double distance = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;

        double secondaryDistance = 0;
        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;
            acc = (_primaryForce + _secondaryForce) / _mass;
            secondaryDistance = primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return distance + secondaryDistance;
    }
}
