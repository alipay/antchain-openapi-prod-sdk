<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteLoadbalanceMountRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // id
    /**
     * @var string
     */
    public $id;

    // computer_ids
    /**
     * @var string[]
     */
    public $computerIds;
    protected $_name = [
        'authToken'   => 'auth_token',
        'id'          => 'id',
        'computerIds' => 'computer_ids',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('computerIds', $this->computerIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteLoadbalanceMountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
        }

        return $model;
    }
}
