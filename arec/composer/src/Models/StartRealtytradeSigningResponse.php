<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class StartRealtytradeSigningResponse extends Model
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

    // 签署流程 ID
    /**
     * @var string
     */
    public $processId;

    // 签署中的多个合同文件信息
    /**
     * @var Contract[]
     */
    public $contractList;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'processId'    => 'process_id',
        'contractList' => 'contract_list',
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
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->contractList) {
            $res['contract_list'] = [];
            if (null !== $this->contractList && \is_array($this->contractList)) {
                $n = 0;
                foreach ($this->contractList as $item) {
                    $res['contract_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartRealtytradeSigningResponse
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
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['contract_list'])) {
            if (!empty($map['contract_list'])) {
                $model->contractList = [];
                $n                   = 0;
                foreach ($map['contract_list'] as $item) {
                    $model->contractList[$n++] = null !== $item ? Contract::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
