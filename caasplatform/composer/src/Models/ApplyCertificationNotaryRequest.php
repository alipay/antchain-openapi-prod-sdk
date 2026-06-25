<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class ApplyCertificationNotaryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 业务流水ID
    /**
     * @var string
     */
    public $bizId;

    // 申请主体信息（公证处Identity结构）
    /**
     * @var ApplicantInfo
     */
    public $applicant;

    // 环节明细列表
    /**
     * @var StepDetailInfo[]
     */
    public $stepDetailInfos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'applicant'         => 'applicant',
        'stepDetailInfos'   => 'step_detail_infos',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('applicant', $this->applicant, true);
        Model::validateRequired('stepDetailInfos', $this->stepDetailInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->applicant) {
            $res['applicant'] = null !== $this->applicant ? $this->applicant->toMap() : null;
        }
        if (null !== $this->stepDetailInfos) {
            $res['step_detail_infos'] = [];
            if (null !== $this->stepDetailInfos && \is_array($this->stepDetailInfos)) {
                $n = 0;
                foreach ($this->stepDetailInfos as $item) {
                    $res['step_detail_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyCertificationNotaryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['applicant'])) {
            $model->applicant = ApplicantInfo::fromMap($map['applicant']);
        }
        if (isset($map['step_detail_infos'])) {
            if (!empty($map['step_detail_infos'])) {
                $model->stepDetailInfos = [];
                $n                      = 0;
                foreach ($map['step_detail_infos'] as $item) {
                    $model->stepDetailInfos[$n++] = null !== $item ? StepDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
