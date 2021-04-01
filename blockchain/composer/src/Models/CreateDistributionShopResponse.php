<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributionShopResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 商户管理员唯一标识
    /**
     * @var string
     */
    public $adminUserId;

    // 商户创建时间
    /**
     * @var string
     */
    public $createTime;

    // 商户唯一标识
    /**
     * @var string
     */
    public $shopId;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'adminUserId' => 'admin_user_id',
        'createTime'  => 'create_time',
        'shopId'      => 'shop_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->adminUserId) {
            $res['admin_user_id'] = $this->adminUserId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributionShopResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['admin_user_id'])) {
            $model->adminUserId = $map['admin_user_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }

        return $model;
    }
}
