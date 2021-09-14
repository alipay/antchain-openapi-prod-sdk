<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class GetDasIndividualvcRequest extends Model
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

    // 授权实例biz_uuid
    /**
     * @var string
     */
    public $authInstanceBizUuid;

    // 授权人个人信息
    /**
     * @var AuthPersonIndividualInfo
     */
    public $authedPersonIndividualInfo;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'authInstanceBizUuid'        => 'auth_instance_biz_uuid',
        'authedPersonIndividualInfo' => 'authed_person_individual_info',
    ];

    public function validate()
    {
        Model::validateRequired('authInstanceBizUuid', $this->authInstanceBizUuid, true);
        Model::validateRequired('authedPersonIndividualInfo', $this->authedPersonIndividualInfo, true);
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
        if (null !== $this->authedPersonIndividualInfo) {
            $res['authed_person_individual_info'] = null !== $this->authedPersonIndividualInfo ? $this->authedPersonIndividualInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDasIndividualvcRequest
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
        if (isset($map['authed_person_individual_info'])) {
            $model->authedPersonIndividualInfo = AuthPersonIndividualInfo::fromMap($map['authed_person_individual_info']);
        }

        return $model;
    }
}
