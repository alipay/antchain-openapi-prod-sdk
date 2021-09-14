<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class VerifyDasAuthresultRequest extends Model
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

    // 数据源biz_uuid列表
    /**
     * @var string[]
     */
    public $dataSourceBizUuids;

    // 被授权企业接入应用名称
    /**
     * @var string
     */
    public $beAuthedPersonAppName;

    // 授权企业统一社会信用码
    /**
     * @var string
     */
    public $authPersonEnterpriseCreditNum;
    protected $_name = [
        'authToken'                     => 'auth_token',
        'productInstanceId'             => 'product_instance_id',
        'dataSourceBizUuids'            => 'data_source_biz_uuids',
        'beAuthedPersonAppName'         => 'be_authed_person_app_name',
        'authPersonEnterpriseCreditNum' => 'auth_person_enterprise_credit_num',
    ];

    public function validate()
    {
        Model::validateRequired('dataSourceBizUuids', $this->dataSourceBizUuids, true);
        Model::validateRequired('beAuthedPersonAppName', $this->beAuthedPersonAppName, true);
        Model::validateRequired('authPersonEnterpriseCreditNum', $this->authPersonEnterpriseCreditNum, true);
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
        if (null !== $this->dataSourceBizUuids) {
            $res['data_source_biz_uuids'] = $this->dataSourceBizUuids;
        }
        if (null !== $this->beAuthedPersonAppName) {
            $res['be_authed_person_app_name'] = $this->beAuthedPersonAppName;
        }
        if (null !== $this->authPersonEnterpriseCreditNum) {
            $res['auth_person_enterprise_credit_num'] = $this->authPersonEnterpriseCreditNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDasAuthresultRequest
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
        if (isset($map['data_source_biz_uuids'])) {
            if (!empty($map['data_source_biz_uuids'])) {
                $model->dataSourceBizUuids = $map['data_source_biz_uuids'];
            }
        }
        if (isset($map['be_authed_person_app_name'])) {
            $model->beAuthedPersonAppName = $map['be_authed_person_app_name'];
        }
        if (isset($map['auth_person_enterprise_credit_num'])) {
            $model->authPersonEnterpriseCreditNum = $map['auth_person_enterprise_credit_num'];
        }

        return $model;
    }
}
