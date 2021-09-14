<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteDasDatasourceRequest extends Model
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

    // 要删除的数据源biz_uuid
    /**
     * @var string
     */
    public $bizUuid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizUuid'           => 'biz_uuid',
    ];

    public function validate()
    {
        Model::validateRequired('bizUuid', $this->bizUuid, true);
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
        if (null !== $this->bizUuid) {
            $res['biz_uuid'] = $this->bizUuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDasDatasourceRequest
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
        if (isset($map['biz_uuid'])) {
            $model->bizUuid = $map['biz_uuid'];
        }

        return $model;
    }
}
