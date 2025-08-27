<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class TerminateApplyEvidence extends Model
{
    // 用户申请解约问题类型
    /**
     * @example 操作复杂
     *
     * @var string
     */
    public $terminateApplyReason;

    // 用户申请解约问题描述
    /**
     * @example 具体描述
     *
     * @var string
     */
    public $terminateApplyRefer;

    // 用户联系电话
    /**
     * @example 15674433257
     *
     * @var string
     */
    public $userPhoneNum;

    // 用户申请解约证据（图片、视频）
    /**
     * @example ["fileKey"]
     *
     * @var string[]
     */
    public $terminateApplyEvidences;

    // 用户申请提交材料时间
    /**
     * @example 2025-01-01 12:00:00
     *
     * @var string
     */
    public $terminateOperateTime;
    protected $_name = [
        'terminateApplyReason'    => 'terminate_apply_reason',
        'terminateApplyRefer'     => 'terminate_apply_refer',
        'userPhoneNum'            => 'user_phone_num',
        'terminateApplyEvidences' => 'terminate_apply_evidences',
        'terminateOperateTime'    => 'terminate_operate_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->terminateApplyReason) {
            $res['terminate_apply_reason'] = $this->terminateApplyReason;
        }
        if (null !== $this->terminateApplyRefer) {
            $res['terminate_apply_refer'] = $this->terminateApplyRefer;
        }
        if (null !== $this->userPhoneNum) {
            $res['user_phone_num'] = $this->userPhoneNum;
        }
        if (null !== $this->terminateApplyEvidences) {
            $res['terminate_apply_evidences'] = $this->terminateApplyEvidences;
        }
        if (null !== $this->terminateOperateTime) {
            $res['terminate_operate_time'] = $this->terminateOperateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TerminateApplyEvidence
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['terminate_apply_reason'])) {
            $model->terminateApplyReason = $map['terminate_apply_reason'];
        }
        if (isset($map['terminate_apply_refer'])) {
            $model->terminateApplyRefer = $map['terminate_apply_refer'];
        }
        if (isset($map['user_phone_num'])) {
            $model->userPhoneNum = $map['user_phone_num'];
        }
        if (isset($map['terminate_apply_evidences'])) {
            if (!empty($map['terminate_apply_evidences'])) {
                $model->terminateApplyEvidences = $map['terminate_apply_evidences'];
            }
        }
        if (isset($map['terminate_operate_time'])) {
            $model->terminateOperateTime = $map['terminate_operate_time'];
        }

        return $model;
    }
}
