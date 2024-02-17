using DiffR.Logic;

string input = "Expected actual to be \"{jsonObject}\", but \"{jsonObject}\" differs near \"3,9\" (index 1964).";


var myString = new MyFormatter().GetFormattedJson(input);