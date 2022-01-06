<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgDowngradegroupsResponse extends Model
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

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 降级规则组列表
    /**
     * @var DowngradeRuleGroupVo[]
     */
    public $downgradeRuleGroups;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 总条数
    /**
     * @var int
     */
    public $totalSize;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'currentPage'         => 'current_page',
        'downgradeRuleGroups' => 'downgrade_rule_groups',
        'pageSize'            => 'page_size',
        'totalSize'           => 'total_size',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->downgradeRuleGroups) {
            $res['downgrade_rule_groups'] = [];
            if (null !== $this->downgradeRuleGroups && \is_array($this->downgradeRuleGroups)) {
                $n = 0;
                foreach ($this->downgradeRuleGroups as $item) {
                    $res['downgrade_rule_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgDowngradegroupsResponse
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
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['downgrade_rule_groups'])) {
            if (!empty($map['downgrade_rule_groups'])) {
                $model->downgradeRuleGroups = [];
                $n                          = 0;
                foreach ($map['downgrade_rule_groups'] as $item) {
                    $model->downgradeRuleGroups[$n++] = null !== $item ? DowngradeRuleGroupVo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }

        return $model;
    }
}
