<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerAgreementterminateResponse extends Model
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

    // 总条数
    /**
     * @var int
     */
    public $totalCount;

    // (异步)解约申请列表
    /**
     * @var AgreementTerminateApplyInfo[]
     */
    public $terminateApplyList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'totalCount'         => 'total_count',
        'terminateApplyList' => 'terminate_apply_list',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->terminateApplyList) {
            $res['terminate_apply_list'] = [];
            if (null !== $this->terminateApplyList && \is_array($this->terminateApplyList)) {
                $n = 0;
                foreach ($this->terminateApplyList as $item) {
                    $res['terminate_apply_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerAgreementterminateResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['terminate_apply_list'])) {
            if (!empty($map['terminate_apply_list'])) {
                $model->terminateApplyList = [];
                $n                         = 0;
                foreach ($map['terminate_apply_list'] as $item) {
                    $model->terminateApplyList[$n++] = null !== $item ? AgreementTerminateApplyInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
