<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditIssuebytimeResponse extends Model
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

    // 信用流转批次号
    /**
     * @var string
     */
    public $batchId;

    // 批次状态
    /**
     * @var int
     */
    public $batchIdStatus;

    // 凭证发行者did
    /**
     * @var string
     */
    public $did;

    // 凭证列表
    /**
     * @var IssueIdInfo[]
     */
    public $issueIds;

    // 页数 从1开始
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示数量
    /**
     * @var int
     */
    public $pageSize;

    // 数据总量
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'batchId'       => 'batch_id',
        'batchIdStatus' => 'batch_id_status',
        'did'           => 'did',
        'issueIds'      => 'issue_ids',
        'pageNum'       => 'page_num',
        'pageSize'      => 'page_size',
        'totalCount'    => 'total_count',
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->batchIdStatus) {
            $res['batch_id_status'] = $this->batchIdStatus;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->issueIds) {
            $res['issue_ids'] = [];
            if (null !== $this->issueIds && \is_array($this->issueIds)) {
                $n = 0;
                foreach ($this->issueIds as $item) {
                    $res['issue_ids'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditIssuebytimeResponse
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['batch_id_status'])) {
            $model->batchIdStatus = $map['batch_id_status'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['issue_ids'])) {
            if (!empty($map['issue_ids'])) {
                $model->issueIds = [];
                $n               = 0;
                foreach ($map['issue_ids'] as $item) {
                    $model->issueIds[$n++] = null !== $item ? IssueIdInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
