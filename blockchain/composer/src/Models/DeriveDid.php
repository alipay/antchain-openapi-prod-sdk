<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DeriveDid extends Model
{
    // 派生的子did
    /**
     * @example did:mychain:xxxx
     *
     * @var string
     */
    public $childdid;

    // 子did 的did doc
    /**
     * @example xxx
     *
     * @var string
     */
    public $childdiddoc;

    // 用户输入用于派生子did的派生码
    /**
     * @example asdfghj
     *
     * @var string
     */
    public $code;
    protected $_name = [
        'childdid'    => 'childdid',
        'childdiddoc' => 'childdiddoc',
        'code'        => 'code',
    ];

    public function validate()
    {
        Model::validateRequired('childdid', $this->childdid, true);
        Model::validateRequired('childdiddoc', $this->childdiddoc, true);
        Model::validateRequired('code', $this->code, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->childdid) {
            $res['childdid'] = $this->childdid;
        }
        if (null !== $this->childdiddoc) {
            $res['childdiddoc'] = $this->childdiddoc;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeriveDid
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['childdid'])) {
            $model->childdid = $map['childdid'];
        }
        if (isset($map['childdiddoc'])) {
            $model->childdiddoc = $map['childdiddoc'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }

        return $model;
    }
}
