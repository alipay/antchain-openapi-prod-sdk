<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RiskData extends Model
{
    // 联系人信息列表
    /**
     * @example [{}]
     *
     * @var Contact[]
     */
    public $contacts;

    // 人脸对比分
    /**
     * @example x
     *
     * @var string
     */
    public $facePoint;

    // 活体供应商
    /**
     * @example 活体供应商
     *
     * @var string
     */
    public $faceSource;
    protected $_name = [
        'contacts'   => 'contacts',
        'facePoint'  => 'face_point',
        'faceSource' => 'face_source',
    ];

    public function validate()
    {
        Model::validateRequired('contacts', $this->contacts, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contacts) {
            $res['contacts'] = [];
            if (null !== $this->contacts && \is_array($this->contacts)) {
                $n = 0;
                foreach ($this->contacts as $item) {
                    $res['contacts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->facePoint) {
            $res['face_point'] = $this->facePoint;
        }
        if (null !== $this->faceSource) {
            $res['face_source'] = $this->faceSource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contacts'])) {
            if (!empty($map['contacts'])) {
                $model->contacts = [];
                $n               = 0;
                foreach ($map['contacts'] as $item) {
                    $model->contacts[$n++] = null !== $item ? Contact::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['face_point'])) {
            $model->facePoint = $map['face_point'];
        }
        if (isset($map['face_source'])) {
            $model->faceSource = $map['face_source'];
        }

        return $model;
    }
}
