<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeprecateBuildpackRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // depracationNoteMap
    /**
     * @var DepracationNotePayload
     */
    public $depracationNoteMap;

    // ids
    /**
     * @var string[]
     */
    public $id;
    protected $_name = [
        'authToken'          => 'auth_token',
        'tenant'             => 'tenant',
        'depracationNoteMap' => 'depracation_note_map',
        'id'                 => 'id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->depracationNoteMap) {
            $res['depracation_note_map'] = null !== $this->depracationNoteMap ? $this->depracationNoteMap->toMap() : null;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeprecateBuildpackRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['depracation_note_map'])) {
            $model->depracationNoteMap = DepracationNotePayload::fromMap($map['depracation_note_map']);
        }
        if (isset($map['id'])) {
            if (!empty($map['id'])) {
                $model->id = $map['id'];
            }
        }

        return $model;
    }
}
