<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceResponse extends Model
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

    // 业务授权列表
    /**
     * @var BusinessRecordsPairs[]
     */
    public $businessAuthorizeRecords;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'businessAuthorizeRecords' => 'business_authorize_records',
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
        if (null !== $this->businessAuthorizeRecords) {
            $res['business_authorize_records'] = [];
            if (null !== $this->businessAuthorizeRecords && \is_array($this->businessAuthorizeRecords)) {
                $n = 0;
                foreach ($this->businessAuthorizeRecords as $item) {
                    $res['business_authorize_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceResponse
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
        if (isset($map['business_authorize_records'])) {
            if (!empty($map['business_authorize_records'])) {
                $model->businessAuthorizeRecords = [];
                $n                               = 0;
                foreach ($map['business_authorize_records'] as $item) {
                    $model->businessAuthorizeRecords[$n++] = null !== $item ? BusinessRecordsPairs::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
