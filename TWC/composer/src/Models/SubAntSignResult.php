<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SubAntSignResult extends Model
{
    // 子业务流水号
    /**
     * @example subBizNo12345678901
     *
     * @var string
     */
    public $subBizNo;

    // 子任务流水号
    /**
     * @example 子任务流水号
     *
     * @var string
     */
    public $signTaskId;

    // 我方userId
    /**
     * @example 我方userId
     *
     * @var string
     */
    public $ourUserId;

    // 是否关联业务
    /**
     * @example true, false
     *
     * @var bool
     */
    public $relatedBusiness;

    // 签署链接
    /**
     * @example
     *
     * @var AntSignUrlResult[]
     */
    public $antSignUrlResultList;
    protected $_name = [
        'subBizNo'             => 'sub_biz_no',
        'signTaskId'           => 'sign_task_id',
        'ourUserId'            => 'our_user_id',
        'relatedBusiness'      => 'related_business',
        'antSignUrlResultList' => 'ant_sign_url_result_list',
    ];

    public function validate()
    {
        Model::validateRequired('subBizNo', $this->subBizNo, true);
        Model::validateRequired('antSignUrlResultList', $this->antSignUrlResultList, true);
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
        if (null !== $this->antSignUrlResultList) {
            $res['ant_sign_url_result_list'] = [];
            if (null !== $this->antSignUrlResultList && \is_array($this->antSignUrlResultList)) {
                $n = 0;
                foreach ($this->antSignUrlResultList as $item) {
                    $res['ant_sign_url_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubAntSignResult
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
        if (isset($map['ant_sign_url_result_list'])) {
            if (!empty($map['ant_sign_url_result_list'])) {
                $model->antSignUrlResultList = [];
                $n                           = 0;
                foreach ($map['ant_sign_url_result_list'] as $item) {
                    $model->antSignUrlResultList[$n++] = null !== $item ? AntSignUrlResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
