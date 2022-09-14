<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeBusinessDetailResponse extends Model
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

    // 社会统一信用代码
    /**
     * @var string
     */
    public $ucCode;

    // 注册日期
    /**
     * @var string
     */
    public $registerDate;

    // 经营地址
    /**
     * @var string
     */
    public $operatingAddrJson;

    // 详细地址
    /**
     * @var string
     */
    public $addressDetail;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'ucCode'            => 'uc_code',
        'registerDate'      => 'register_date',
        'operatingAddrJson' => 'operating_addr_json',
        'addressDetail'     => 'address_detail',
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
        if (null !== $this->ucCode) {
            $res['uc_code'] = $this->ucCode;
        }
        if (null !== $this->registerDate) {
            $res['register_date'] = $this->registerDate;
        }
        if (null !== $this->operatingAddrJson) {
            $res['operating_addr_json'] = $this->operatingAddrJson;
        }
        if (null !== $this->addressDetail) {
            $res['address_detail'] = $this->addressDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeBusinessDetailResponse
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
        if (isset($map['uc_code'])) {
            $model->ucCode = $map['uc_code'];
        }
        if (isset($map['register_date'])) {
            $model->registerDate = $map['register_date'];
        }
        if (isset($map['operating_addr_json'])) {
            $model->operatingAddrJson = $map['operating_addr_json'];
        }
        if (isset($map['address_detail'])) {
            $model->addressDetail = $map['address_detail'];
        }

        return $model;
    }
}
