<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditUserissueResponse extends Model
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

    // 凭证所有者分布式数字身份
    /**
     * @var string
     */
    public $did;

    // 信用流转凭证列表
    /**
     * @var UserIssueId[]
     */
    public $issueIds;

    // 页数
    /**
     * @var int
     */
    public $pageNum;

    // 每页显示最大条数
    /**
     * @var int
     */
    public $pageSize;

    // 总数
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'did'        => 'did',
        'issueIds'   => 'issue_ids',
        'pageNum'    => 'page_num',
        'pageSize'   => 'page_size',
        'totalCount' => 'total_count',
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
     * @return QueryCreditUserissueResponse
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['issue_ids'])) {
            if (!empty($map['issue_ids'])) {
                $model->issueIds = [];
                $n               = 0;
                foreach ($map['issue_ids'] as $item) {
                    $model->issueIds[$n++] = null !== $item ? UserIssueId::fromMap($item) : $item;
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
