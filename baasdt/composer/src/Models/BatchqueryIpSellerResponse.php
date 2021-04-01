<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpSellerResponse extends Model
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

    // 结果总数，不是列表值，用于分页
    //
    /**
     * @var int
     */
    public $allCount;

    // 版权方申请列表
    /**
     * @var IPApplyInfo[]
     */
    public $applyList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'allCount'   => 'all_count',
        'applyList'  => 'apply_list',
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
        if (null !== $this->allCount) {
            $res['all_count'] = $this->allCount;
        }
        if (null !== $this->applyList) {
            $res['apply_list'] = [];
            if (null !== $this->applyList && \is_array($this->applyList)) {
                $n = 0;
                foreach ($this->applyList as $item) {
                    $res['apply_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpSellerResponse
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
        if (isset($map['all_count'])) {
            $model->allCount = $map['all_count'];
        }
        if (isset($map['apply_list'])) {
            if (!empty($map['apply_list'])) {
                $model->applyList = [];
                $n                = 0;
                foreach ($map['apply_list'] as $item) {
                    $model->applyList[$n++] = null !== $item ? IPApplyInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
