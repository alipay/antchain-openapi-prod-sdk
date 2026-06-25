<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class StepDetailInfo extends Model
{
    // 环节编号
    /**
     * @example STEP_1
     *
     * @var string
     */
    public $stepNo;

    // 存证时的原始信息明文
    /**
     * @example {"asda":"asa"}
     *
     * @var string
     */
    public $metaContent;
    protected $_name = [
        'stepNo'      => 'step_no',
        'metaContent' => 'meta_content',
    ];

    public function validate()
    {
        Model::validateRequired('stepNo', $this->stepNo, true);
        Model::validateRequired('metaContent', $this->metaContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stepNo) {
            $res['step_no'] = $this->stepNo;
        }
        if (null !== $this->metaContent) {
            $res['meta_content'] = $this->metaContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StepDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['step_no'])) {
            $model->stepNo = $map['step_no'];
        }
        if (isset($map['meta_content'])) {
            $model->metaContent = $map['meta_content'];
        }

        return $model;
    }
}
