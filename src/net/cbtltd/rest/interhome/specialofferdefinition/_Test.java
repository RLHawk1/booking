package net.cbtltd.rest.interhome.specialofferdefinition;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import net.cbtltd.server.RazorServer;
import org.apache.ibatis.session.SqlSession;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-09T13:20:11.648+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class _Test {

	private _Test() {}

	public static void main(String args[]) throws Exception {
		SqlSession sqlSession = RazorServer.openSession();
		try {
			JAXBContext jc = JAXBContext.newInstance("net.cbtltd.rest.interhome.specialofferdefinition");
			Unmarshaller um = jc.createUnmarshaller();
			
			Definitions definitions = (Definitions) um.unmarshal(new java.io.FileInputStream( "C:/specialofferdefiniton_en.xml" ));

			int i = 0;
			for (Definition definition : definitions.getDefinition()) {
				System.out.println(i++ + " " + definition);
//				Product product = sqlSession.getMapper(ProductMapper.class).altread(new NameId(HasUrls.PARTY_INTERHOME_ID, definition.getCode()));
//				if (product == null) {throw new ServiceException(Error.product_id, definition.getCode());}
//				sqlSession.getMapper(DefinitionMapper.class).create(action);
//				sqlSession.commit();
			}
		} catch (Throwable x) {x.printStackTrace();}

		System.out.println("Finished...");
		System.exit(0);
	}
}
