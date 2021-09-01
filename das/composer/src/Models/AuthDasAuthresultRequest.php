<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthDasAuthresultRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据源ID列表
    /**
     * @var string[]
     */
    public $dataSourceIds;

    // 被授权企业接入应用名称
    /**
     * @var string
     */
    public $beAuthedPersonAppName;

    // 授权企业信息
    /**
     * @var AuthPersonEnterpriseInfo
     */
    public $authPersonEnterpriseInfo;

    // 授权人信息
    /**
     * @var AuthPersonIndividualInfo
     */
    public $authPersonIndividualInfo;

    // oss_path 列表
    /**
     * @var string[]
     */
    public $protocols;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'dataSourceIds'            => 'data_source_ids',
        'beAuthedPersonAppName'    => 'be_authed_person_app_name',
        'authPersonEnterpriseInfo' => 'auth_person_enterprise_info',
        'authPersonIndividualInfo' => 'auth_person_individual_info',
        'protocols'                => 'protocols',
    ];

    public function validate()
    {
        Model::validateRequired('dataSourceIds', $this->dataSourceIds, true);
        Model::validateRequired('beAuthedPersonAppName', $this->beAuthedPersonAppName, true);
        Model::validateRequired('protocols', $this->protocols, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->dataSourceIds) {
            $res['data_source_ids'] = $this->dataSourceIds;
        }
        if (null !== $this->beAuthedPersonAppName) {
            $res['be_authed_person_app_name'] = $this->beAuthedPersonAppName;
        }
        if (null !== $this->authPersonEnterpriseInfo) {
            $res['auth_person_enterprise_info'] = null !== $this->authPersonEnterpriseInfo ? $this->authPersonEnterpriseInfo->toMap() : null;
        }
        if (null !== $this->authPersonIndividualInfo) {
            $res['auth_person_individual_info'] = null !== $this->authPersonIndividualInfo ? $this->authPersonIndividualInfo->toMap() : null;
        }
        if (null !== $this->protocols) {
            $res['protocols'] = $this->protocols;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthDasAuthresultRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['data_source_ids'])) {
            if (!empty($map['data_source_ids'])) {
                $model->dataSourceIds = $map['data_source_ids'];
            }
        }
        if (isset($map['be_authed_person_app_name'])) {
            $model->beAuthedPersonAppName = $map['be_authed_person_app_name'];
        }
        if (isset($map['auth_person_enterprise_info'])) {
            $model->authPersonEnterpriseInfo = AuthPersonEnterpriseInfo::fromMap($map['auth_person_enterprise_info']);
        }
        if (isset($map['auth_person_individual_info'])) {
            $model->authPersonIndividualInfo = AuthPersonIndividualInfo::fromMap($map['auth_person_individual_info']);
        }
        if (isset($map['protocols'])) {
            if (!empty($map['protocols'])) {
                $model->protocols = $map['protocols'];
            }
        }

        return $model;
    }
}
