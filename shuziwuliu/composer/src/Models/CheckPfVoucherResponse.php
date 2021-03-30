<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CheckPfVoucherResponse extends Model
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

    // 核验结果
    /**
     * @var PfVoucherCheckResult[]
     */
    public $checkResults;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'checkResults' => 'check_results',
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
        if (null !== $this->checkResults) {
            $res['check_results'] = [];
            if (null !== $this->checkResults && \is_array($this->checkResults)) {
                $n = 0;
                foreach ($this->checkResults as $item) {
                    $res['check_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckPfVoucherResponse
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
        if (isset($map['check_results'])) {
            if (!empty($map['check_results'])) {
                $model->checkResults = [];
                $n                   = 0;
                foreach ($map['check_results'] as $item) {
                    $model->checkResults[$n++] = null !== $item ? PfVoucherCheckResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
