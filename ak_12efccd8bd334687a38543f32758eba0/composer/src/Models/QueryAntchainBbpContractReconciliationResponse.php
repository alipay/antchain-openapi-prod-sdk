<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_12efccd8bd334687a38543f32758eba0\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainBbpContractReconciliationResponse extends Model
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

    // 结算单
    /**
     * @var Reconciliation[]
     */
    public $reconciliations;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'reconciliations' => 'reconciliations',
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
        if (null !== $this->reconciliations) {
            $res['reconciliations'] = [];
            if (null !== $this->reconciliations && \is_array($this->reconciliations)) {
                $n = 0;
                foreach ($this->reconciliations as $item) {
                    $res['reconciliations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainBbpContractReconciliationResponse
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
        if (isset($map['reconciliations'])) {
            if (!empty($map['reconciliations'])) {
                $model->reconciliations = [];
                $n                      = 0;
                foreach ($map['reconciliations'] as $item) {
                    $model->reconciliations[$n++] = null !== $item ? Reconciliation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
