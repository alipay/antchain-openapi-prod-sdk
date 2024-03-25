<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class SendPromoPrizeRequest extends Model
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

    // 鲸探用户唯一标识
    /**
     * @var string
     */
    public $openUserId;

    // 海豚活动ID，鲸探运营在海豚创建的活动ID
    /**
     * @var string
     */
    public $campId;

    // 海豚奖品ID，鲸探运营在海豚创建的奖品ID
    /**
     * @var string
     */
    public $prizeId;

    // 调用方唯一幂等号
    /**
     * @var string
     */
    public $bizNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openUserId'        => 'open_user_id',
        'campId'            => 'camp_id',
        'prizeId'           => 'prize_id',
        'bizNo'             => 'biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('openUserId', $this->openUserId, true);
        Model::validateRequired('campId', $this->campId, true);
        Model::validateRequired('prizeId', $this->prizeId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
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
        if (null !== $this->openUserId) {
            $res['open_user_id'] = $this->openUserId;
        }
        if (null !== $this->campId) {
            $res['camp_id'] = $this->campId;
        }
        if (null !== $this->prizeId) {
            $res['prize_id'] = $this->prizeId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendPromoPrizeRequest
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
        if (isset($map['open_user_id'])) {
            $model->openUserId = $map['open_user_id'];
        }
        if (isset($map['camp_id'])) {
            $model->campId = $map['camp_id'];
        }
        if (isset($map['prize_id'])) {
            $model->prizeId = $map['prize_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }

        return $model;
    }
}
