import { Navigate } from 'react-router-dom';

const Root = () => {
	const getRootUrl = () => {
		const url = 'dashboard/ecommerce';
		return url;
	};

	const url = getRootUrl();

	return <Navigate to={`/${url}`} />;
};

export default Root;
