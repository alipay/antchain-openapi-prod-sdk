<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BindIpShopResponse extends Model
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

    // 淘宝店铺数据授权跳转链接
    /**
     * @var string
     */
    public $authUri;

    // 授权申请的内部编码
    /**
     * @var string
     */
    public $itemCode;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'authUri'    => 'auth_uri',
        'itemCode'   => 'item_code',
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
        if (null !== $this->authUri) {
            $res['auth_uri'] = $this->authUri;
        }
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindIpShopResponse
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
        if (isset($map['auth_uri'])) {
            $model->authUri = $map['auth_uri'];
        }
        if (isset($map['item_code'])) {
            $model->itemCode = $map['item_code'];
        }

        return $model;
    }
}
