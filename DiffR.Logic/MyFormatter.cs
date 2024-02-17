using Antlr4.Runtime;

namespace DiffR.Logic
{
    public class MyFormatter 
    {
        public string GetFormattedJson(string jsonText)
        {
            AntlrInputStream inputStream = new AntlrInputStream(jsonText);
            DiffRHelperLexer lexer = new DiffRHelperLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            DiffRHelperParser parser = new DiffRHelperParser(commonTokenStream);
            
            DiffRHelperParser.LineContext linesContext = parser.line();
            MyVisitor visitor = new MyVisitor();
            visitor.VisitLine(linesContext);

            return string.Empty;
        }
    }
}
