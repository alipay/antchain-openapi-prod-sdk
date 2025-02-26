<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class DciExplanationInfo extends Model
{
    // 创作目的，描述作品创作的目的
    /**
     * @example xx的创作目的
     *
     * @var string
     */
    public $creationPurpose;

    // 创作过程，具体的创作过程
    /**
     * @example xx的创作过程
     *
     * @var string
     */
    public $creationProcess;

    // 阐述作品的独创性
    /**
     * @example 独创性说明
     *
     * @var string
     */
    public $originality;

    // 创作过程涉及到字体使用相关版权说明
    /**
     * @example 字体申明
     *
     * @var string
     */
    public $fontCopyright;

    // 创作过程涉及到字体使用相关版权说明
    //
    /**
     * @example
     *
     * @var string[]
     */
    public $fontTypes;
    protected $_name = [
        'creationPurpose' => 'creation_purpose',
        'creationProcess' => 'creation_process',
        'originality'     => 'originality',
        'fontCopyright'   => 'font_copyright',
        'fontTypes'       => 'font_types',
    ];

    public function validate()
    {
        Model::validateRequired('creationPurpose', $this->creationPurpose, true);
        Model::validateRequired('creationProcess', $this->creationProcess, true);
        Model::validateRequired('originality', $this->originality, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creationPurpose) {
            $res['creation_purpose'] = $this->creationPurpose;
        }
        if (null !== $this->creationProcess) {
            $res['creation_process'] = $this->creationProcess;
        }
        if (null !== $this->originality) {
            $res['originality'] = $this->originality;
        }
        if (null !== $this->fontCopyright) {
            $res['font_copyright'] = $this->fontCopyright;
        }
        if (null !== $this->fontTypes) {
            $res['font_types'] = $this->fontTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DciExplanationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creation_purpose'])) {
            $model->creationPurpose = $map['creation_purpose'];
        }
        if (isset($map['creation_process'])) {
            $model->creationProcess = $map['creation_process'];
        }
        if (isset($map['originality'])) {
            $model->originality = $map['originality'];
        }
        if (isset($map['font_copyright'])) {
            $model->fontCopyright = $map['font_copyright'];
        }
        if (isset($map['font_types'])) {
            if (!empty($map['font_types'])) {
                $model->fontTypes = $map['font_types'];
            }
        }

        return $model;
    }
}
