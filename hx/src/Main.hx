class Main {

    public static function main():Void {
        final foo = giveFunc("Overlord");
        final result = foo("Nathan", 12);
        trace(result);

        takeFunc((number, shouldNegate) -> {
            final output = shouldNegate ? -number : number;
            trace(output);
        });
    }

    public static function giveFunc(title:String):(String, Int) -> String {
        return (name, age) -> '$title $name: $age years old';
    }

    public static function takeFunc(func:(Float, Bool) -> Void):Void {
        func(12.5, true);
    }

}