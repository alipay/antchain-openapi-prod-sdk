<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class QueryRealtytradeSigningResponse extends Model
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

    // 签署流程状态，包括值为：Initial、Pending、Ready、Started、Finish
    /**
     * @var string
     */
    public $status;

    // 签署结果，包括值为：2-完成，所有签署人完成签署，3-撤销，发起方撤销签署任务，5-过期（签署截止日到期后触发），7-拒签
    /**
     * @var string
     */
    public $signingResult;

    // 合同信息列表，列表描述本流程中的多个文件详情，只有签署结果为完成时才有合同的归档文件下载路径：archived_file_url
    /**
     * @var Contract[]
     */
    public $contractList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'processId'     => 'process_id',
        'status'        => 'status',
        'signingResult' => 'signing_result',
        'contractList'  => 'contract_list',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->signingResult) {
            $res['signing_result'] = $this->signingResult;
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
     * @return QueryRealtytradeSigningResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['signing_result'])) {
            $model->signingResult = $map['signing_result'];
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
