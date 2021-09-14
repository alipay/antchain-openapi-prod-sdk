<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class VerifyDasEnterpriseRequest extends Model
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

    // 被授权企业接入应用ID
    /**
     * @var string
     */
    public $authInstanceBizUuid;

    // VC完整内容
    /**
     * @var string
     */
    public $vc;

    // 被授权企业信息
    /**
     * @var BeAuthedPersonInfo
     */
    public $beAuthedPersonInfo;

    // 授权人企业信息
    /**
     * @var AuthPersonEnterpriseInfo
     */
    public $authPersonEnterpriseInfo;

    // 需要访问的数据源信息列表
    /**
     * @var DataSource[]
     */
    public $dataSourceInfo;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'authInstanceBizUuid'      => 'auth_instance_biz_uuid',
        'vc'                       => 'vc',
        'beAuthedPersonInfo'       => 'be_authed_person_info',
        'authPersonEnterpriseInfo' => 'auth_person_enterprise_info',
        'dataSourceInfo'           => 'data_source_info',
    ];

    public function validate()
    {
        Model::validateRequired('authInstanceBizUuid', $this->authInstanceBizUuid, true);
        Model::validateRequired('vc', $this->vc, true);
        Model::validateRequired('beAuthedPersonInfo', $this->beAuthedPersonInfo, true);
        Model::validateRequired('authPersonEnterpriseInfo', $this->authPersonEnterpriseInfo, true);
        Model::validateRequired('dataSourceInfo', $this->dataSourceInfo, true);
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
        if (null !== $this->authInstanceBizUuid) {
            $res['auth_instance_biz_uuid'] = $this->authInstanceBizUuid;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }
        if (null !== $this->beAuthedPersonInfo) {
            $res['be_authed_person_info'] = null !== $this->beAuthedPersonInfo ? $this->beAuthedPersonInfo->toMap() : null;
        }
        if (null !== $this->authPersonEnterpriseInfo) {
            $res['auth_person_enterprise_info'] = null !== $this->authPersonEnterpriseInfo ? $this->authPersonEnterpriseInfo->toMap() : null;
        }
        if (null !== $this->dataSourceInfo) {
            $res['data_source_info'] = [];
            if (null !== $this->dataSourceInfo && \is_array($this->dataSourceInfo)) {
                $n = 0;
                foreach ($this->dataSourceInfo as $item) {
                    $res['data_source_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDasEnterpriseRequest
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
        if (isset($map['auth_instance_biz_uuid'])) {
            $model->authInstanceBizUuid = $map['auth_instance_biz_uuid'];
        }
        if (isset($map['vc'])) {
            $model->vc = $map['vc'];
        }
        if (isset($map['be_authed_person_info'])) {
            $model->beAuthedPersonInfo = BeAuthedPersonInfo::fromMap($map['be_authed_person_info']);
        }
        if (isset($map['auth_person_enterprise_info'])) {
            $model->authPersonEnterpriseInfo = AuthPersonEnterpriseInfo::fromMap($map['auth_person_enterprise_info']);
        }
        if (isset($map['data_source_info'])) {
            if (!empty($map['data_source_info'])) {
                $model->dataSourceInfo = [];
                $n                     = 0;
                foreach ($map['data_source_info'] as $item) {
                    $model->dataSourceInfo[$n++] = null !== $item ? DataSource::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
