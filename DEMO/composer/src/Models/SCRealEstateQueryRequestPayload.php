<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class SCRealEstateQueryRequestPayload extends Model
{
    // xm
    /**
     * @example 张三
     *
     * @var string
     */
    public $xm;

    // sfz
    /**
     * @example 51382219970820817X
     *
     * @var string
     */
    public $sfz;
    protected $_name = [
        'xm'  => 'xm',
        'sfz' => 'sfz',
    ];

    public function validate()
    {
        Model::validateRequired('xm', $this->xm, true);
        Model::validateRequired('sfz', $this->sfz, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->xm) {
            $res['xm'] = $this->xm;
        }
        if (null !== $this->sfz) {
            $res['sfz'] = $this->sfz;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SCRealEstateQueryRequestPayload
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['xm'])) {
            $model->xm = $map['xm'];
        }
        if (isset($map['sfz'])) {
            $model->sfz = $map['sfz'];
        }

        return $model;
    }
}
