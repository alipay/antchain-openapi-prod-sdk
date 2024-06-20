<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class ListGeneralDivideRequest extends Model
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

    // 合约实例id
    /**
     * @var string
     */
    public $serviceId;

    // 分账方ID
    /**
     * @var string
     */
    public $userId;

    // 分账列表起始序号
    /**
     * @var string
     */
    public $strStartIndex;

    // 分账明细查询截止序号
    /**
     * @var string
     */
    public $strEndIndex;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceId'         => 'service_id',
        'userId'            => 'user_id',
        'strStartIndex'     => 'str_start_index',
        'strEndIndex'       => 'str_end_index',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('strStartIndex', $this->strStartIndex, true);
        Model::validateRequired('strEndIndex', $this->strEndIndex, true);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->strStartIndex) {
            $res['str_start_index'] = $this->strStartIndex;
        }
        if (null !== $this->strEndIndex) {
            $res['str_end_index'] = $this->strEndIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListGeneralDivideRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['str_start_index'])) {
            $model->strStartIndex = $map['str_start_index'];
        }
        if (isset($map['str_end_index'])) {
            $model->strEndIndex = $map['str_end_index'];
        }

        return $model;
    }
}
