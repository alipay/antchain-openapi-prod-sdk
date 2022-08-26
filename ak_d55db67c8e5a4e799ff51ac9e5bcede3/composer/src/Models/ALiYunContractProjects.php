<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d55db67c8e5a4e799ff51ac9e5bcede3\Models;

use AlibabaCloud\Tea\Model;

class ALiYunContractProjects extends Model
{
    // contract_projects
    /**
     * @example contract_projects
     *
     * @var ALiYunContractProject[]
     */
    public $contractProjects;

    // pagination
    /**
     * @example pagination
     *
     * @var ALiYunPagination
     */
    public $pagination;
    protected $_name = [
        'contractProjects' => 'contract_projects',
        'pagination'       => 'pagination',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractProjects) {
            $res['contract_projects'] = [];
            if (null !== $this->contractProjects && \is_array($this->contractProjects)) {
                $n = 0;
                foreach ($this->contractProjects as $item) {
                    $res['contract_projects'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunContractProjects
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_projects'])) {
            if (!empty($map['contract_projects'])) {
                $model->contractProjects = [];
                $n                       = 0;
                foreach ($map['contract_projects'] as $item) {
                    $model->contractProjects[$n++] = null !== $item ? ALiYunContractProject::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }

        return $model;
    }
}
