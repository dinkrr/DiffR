using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using DiffR.Logic.Models;
using System;

namespace DiffR.Logic
{
    public class MyVisitor : IDiffRHelperVisitor<MyJsons>
    {
        public MyJsons Visit(IParseTree tree)
        {
            throw new NotImplementedException();
        }

        public MyJsons VisitChildren(IRuleNode node)
        {
            throw new NotImplementedException();
        }

        public MyJsons VisitErrorNode(IErrorNode node)
        {
            throw new NotImplementedException();
        }

        public MyJsons VisitJsonObj([NotNull] DiffRHelperParser.JsonObjContext context)
        {
            throw new NotImplementedException();
        }

        public MyJsons VisitLine([NotNull] DiffRHelperParser.LineContext context)
        {
            DiffRHelperParser.JsonObjContext[] jsons = context.jsonObj();
            MyJsons myJsons = new()
            {
                Expected = jsons[0].GetText(),
                Actual = jsons[1].GetText()
            };

            return myJsons;
        }

        public MyJsons VisitMessage([NotNull] DiffRHelperParser.MessageContext context)
        {
            throw new NotImplementedException();
        }

        public MyJsons VisitTerminal(ITerminalNode node)
        {
            throw new NotImplementedException();
        }

        public MyJsons VisitText([NotNull] DiffRHelperParser.TextContext context)
        {
            throw new NotImplementedException();
        }
    }

}
