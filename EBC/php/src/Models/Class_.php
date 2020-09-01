<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class Class_ extends Model
{
    // 班级id
    /**
     * @example 0001
     *
     * @var string
     */
    public $classId;

    // 企业did
    /**
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36
     *
     * @var string
     */
    public $orgDid;
    protected $_name = [
        'classId' => 'class_id',
        'orgDid'  => 'org_did',
    ];

    public function validate()
    {
        Model::validateMaxLength('classId', $this->classId, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->classId) {
            $res['class_id'] = $this->classId;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Class
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['class_id'])) {
            $model->classId = $map['class_id'];
        }
        if (isset($map['org_did'])) {
            $model->orgDid = $map['org_did'];
        }

        return $model;
    }
}
