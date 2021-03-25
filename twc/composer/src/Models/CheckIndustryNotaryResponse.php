<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CheckIndustryNotaryResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 核验结果数组
    /**
     * @var NotaryCheckResult[]
     */
    public $notaryCheckResults;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'notaryCheckResults' => 'notary_check_results',
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
        if (null !== $this->notaryCheckResults) {
            $res['notary_check_results'] = [];
            if (null !== $this->notaryCheckResults && \is_array($this->notaryCheckResults)) {
                $n = 0;
                foreach ($this->notaryCheckResults as $item) {
                    $res['notary_check_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckIndustryNotaryResponse
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
        if (isset($map['notary_check_results'])) {
            if (!empty($map['notary_check_results'])) {
                $model->notaryCheckResults = [];
                $n                         = 0;
                foreach ($map['notary_check_results'] as $item) {
                    $model->notaryCheckResults[$n++] = null !== $item ? NotaryCheckResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
