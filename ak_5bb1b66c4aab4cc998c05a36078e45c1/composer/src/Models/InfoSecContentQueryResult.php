<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class InfoSecContentQueryResult extends Model
{
    // 检测来源等级
    /**
     * @example 123
     *
     * @var string
     */
    public $detectResourceLevel;

    // 检测结果类型
    /**
     * @example 123
     *
     * @var string
     */
    public $detectTypeCode;

    // 命中内容
    /**
     * @example 123
     *
     * @var string
     */
    public $hitContent;

    // 检测命中来源
    /**
     * @example 123
     *
     * @var string
     */
    public $hitDetectResource;
    protected $_name = [
        'detectResourceLevel' => 'detect_resource_level',
        'detectTypeCode'      => 'detect_type_code',
        'hitContent'          => 'hit_content',
        'hitDetectResource'   => 'hit_detect_resource',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->detectResourceLevel) {
            $res['detect_resource_level'] = $this->detectResourceLevel;
        }
        if (null !== $this->detectTypeCode) {
            $res['detect_type_code'] = $this->detectTypeCode;
        }
        if (null !== $this->hitContent) {
            $res['hit_content'] = $this->hitContent;
        }
        if (null !== $this->hitDetectResource) {
            $res['hit_detect_resource'] = $this->hitDetectResource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InfoSecContentQueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['detect_resource_level'])) {
            $model->detectResourceLevel = $map['detect_resource_level'];
        }
        if (isset($map['detect_type_code'])) {
            $model->detectTypeCode = $map['detect_type_code'];
        }
        if (isset($map['hit_content'])) {
            $model->hitContent = $map['hit_content'];
        }
        if (isset($map['hit_detect_resource'])) {
            $model->hitDetectResource = $map['hit_detect_resource'];
        }

        return $model;
    }
}
