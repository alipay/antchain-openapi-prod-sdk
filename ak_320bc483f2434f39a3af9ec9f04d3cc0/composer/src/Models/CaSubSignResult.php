<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSubSignResult extends Model
{
    // 子业务流水号
    /**
     * @example 323545465
     *
     * @var string
     */
    public $subBizNo;

    // 子任务id
    /**
     * @example 2023wqndoknwqod
     *
     * @var string
     */
    public $signTaskId;

    // 我方签署方id
    /**
     * @example C2022nwodnionwidn
     *
     * @var string
     */
    public $ourUserId;

    // 是否关联业务 true:关联 false：不关联
    /**
     * @example true, false
     *
     * @var bool
     */
    public $relatedBusiness;

    // 签署链接结果列表
    /**
     * @example
     *
     * @var CaSignUrlResult[]
     */
    public $caSignUrlResultList;
    protected $_name = [
        'subBizNo'            => 'sub_biz_no',
        'signTaskId'          => 'sign_task_id',
        'ourUserId'           => 'our_user_id',
        'relatedBusiness'     => 'related_business',
        'caSignUrlResultList' => 'ca_sign_url_result_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subBizNo) {
            $res['sub_biz_no'] = $this->subBizNo;
        }
        if (null !== $this->signTaskId) {
            $res['sign_task_id'] = $this->signTaskId;
        }
        if (null !== $this->ourUserId) {
            $res['our_user_id'] = $this->ourUserId;
        }
        if (null !== $this->relatedBusiness) {
            $res['related_business'] = $this->relatedBusiness;
        }
        if (null !== $this->caSignUrlResultList) {
            $res['ca_sign_url_result_list'] = [];
            if (null !== $this->caSignUrlResultList && \is_array($this->caSignUrlResultList)) {
                $n = 0;
                foreach ($this->caSignUrlResultList as $item) {
                    $res['ca_sign_url_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSubSignResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_biz_no'])) {
            $model->subBizNo = $map['sub_biz_no'];
        }
        if (isset($map['sign_task_id'])) {
            $model->signTaskId = $map['sign_task_id'];
        }
        if (isset($map['our_user_id'])) {
            $model->ourUserId = $map['our_user_id'];
        }
        if (isset($map['related_business'])) {
            $model->relatedBusiness = $map['related_business'];
        }
        if (isset($map['ca_sign_url_result_list'])) {
            if (!empty($map['ca_sign_url_result_list'])) {
                $model->caSignUrlResultList = [];
                $n                          = 0;
                foreach ($map['ca_sign_url_result_list'] as $item) {
                    $model->caSignUrlResultList[$n++] = null !== $item ? CaSignUrlResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
