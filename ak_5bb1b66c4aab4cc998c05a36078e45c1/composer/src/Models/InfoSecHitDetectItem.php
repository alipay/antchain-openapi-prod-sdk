<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class InfoSecHitDetectItem extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $detectTypeCode;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $hitDetectResource;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $hitContent;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $detectResourceLevel;
    protected $_name = [
        'detectTypeCode'      => 'detect_type_code',
        'hitDetectResource'   => 'hit_detect_resource',
        'hitContent'          => 'hit_content',
        'detectResourceLevel' => 'detect_resource_level',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->detectTypeCode) {
            $res['detect_type_code'] = $this->detectTypeCode;
        }
        if (null !== $this->hitDetectResource) {
            $res['hit_detect_resource'] = $this->hitDetectResource;
        }
        if (null !== $this->hitContent) {
            $res['hit_content'] = $this->hitContent;
        }
        if (null !== $this->detectResourceLevel) {
            $res['detect_resource_level'] = $this->detectResourceLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InfoSecHitDetectItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['detect_type_code'])) {
            $model->detectTypeCode = $map['detect_type_code'];
        }
        if (isset($map['hit_detect_resource'])) {
            $model->hitDetectResource = $map['hit_detect_resource'];
        }
        if (isset($map['hit_content'])) {
            $model->hitContent = $map['hit_content'];
        }
        if (isset($map['detect_resource_level'])) {
            $model->detectResourceLevel = $map['detect_resource_level'];
        }

        return $model;
    }
}
